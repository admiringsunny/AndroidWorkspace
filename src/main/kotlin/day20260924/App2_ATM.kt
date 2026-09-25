package day20260924

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
    println(atm.validatePin(1234))
}

class ATM(
    private val validPin: Int,
    private val balance: Double
) {

    fun validatePin(pin: Int): Boolean {
        var attempts = 0
        while (attempts < 3) {
            if (pin == validPin)
                return true
            else
                attempts++
        }
        return false
    }

}