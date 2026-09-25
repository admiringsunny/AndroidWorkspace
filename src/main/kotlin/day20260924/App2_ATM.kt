package day20260924

import java.util.Date

//RP S
//8:07 PM
//ATM Simulation 💳Build an ATM program.

//Menu:
//1. Check Balance
//2. Deposit
//3. Withdraw
//4. Mini Statement
//5. Exit

//Rules:
//PIN must be validated.
//Maximum 3 incorrect attempts.
//Withdrawal cannot exceed balance.
//Withdrawal amount must be a multiple of ₹100.
//Maintain last 5 transactions.Challenge

//Implement the ATM using:
//class
//while
//when
//mutableList
//functions
//exception handling
fun main() {
    val atm = ATM(1111, 0.0)

    //Menu:
    if (!atm.validatePin()) {
        println("Exit")
        return
    }
    atm.showMenu()
}


class ATM(
    private val validPin: Int,
    private var balance: Double,
    private var logs: MutableList<String> = mutableListOf()
) {

    fun validatePin(): Boolean {
        var attempts = 3
        println("Enter your PIN:")
        while (attempts > 0) {
            attempts--
            val pin = readlnOrNull()?.toIntOrNull()
            if (pin == null || pin != validPin)
                println("Incorrect PIN. Attempts left = $attempts")
            else
                return true
        }
        return false
    }


    fun showMenu() {
        println(
            "== Menu: ==\n" +
                    "1. Check Balance\n" +
                    "2. Deposit\n" +
                    "3. Withdraw\n" +
                    "4. Mini Statement\n" +
                    "5. Exit\n"
        )
        val menuItem = readlnOrNull()?.toIntOrNull()
        when (menuItem) {
            1 -> showBalance()
            2 -> deposit()
            3 -> withdraw()
            4 -> miniStatement()
            else -> {
                println("== Exit ==")
                return
            }
        }
    }

    private fun showBalance() {
        println("1. Check Balance")
        println("Your balance is: Rs.$balance")
        showMenu()
    }

    private fun deposit() {
        println("2. Deposit")
        println("Enter deposit amount in x.xx format")
        val depositAmount = readlnOrNull()?.toDoubleOrNull() ?: throw IllegalArgumentException("Amount is not valid")
        balance += depositAmount
        val message = "${Date()}: Amount deposited: Rs.$depositAmount"
        println(message)
        println("New Balance: Rs.$balance")
        saveLogs(message)
        showMenu()
    }

    private fun withdraw() {
        println("3. Withdraw")
        println("Enter Withdraw amount in x.xx format")
        val withdrawAmount = readlnOrNull()?.toDouble() ?: throw IllegalArgumentException("Amount is not valid")
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount
            val message = "${Date()}: Amount Withdrawn: Rs.$withdrawAmount"
            println(message)
            println("New Balance: Rs.$balance")
            saveLogs(message)
        } else {
            println("You don't have sufficient balance!!")
        }
        showMenu()
    }

    private fun saveLogs(message: String) {
        if (logs.size >= 5){
            logs.removeAt(0)
        }
        logs.add(message)
    }

    private fun miniStatement() {
        println("---------------------------")
        println("4. Mini Statement")
        println("---------------------------")
        logs.forEach { log -> println(log) }
        println("${Date()}: Balance: Rs.$balance")
        println("---------------------------")
        showMenu()
    }

}