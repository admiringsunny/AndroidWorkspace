fun main() {
    var username = "sunnyjha"
    var email = "sunny_jha@email.com"
    var dob = "24/01/1984"
    var phoneNumberCountryCode = "+91-1234567890"

    validate(username , email,  dob,   phoneNumberCountryCode)
}

// Write a program to take input (for now u can hardcode the values )
// username , email,  dob,   phone number with country code ,
// with all the validations
fun validate(
    username: String,
    email: String,
    dob: String,
    phoneNumberCountryCode: String): Boolean {
    if (!username.matches(Regex("^[a-zA-Z0-9]{3,8}$"))) return false
    if (!email.matches(Regex("^[a-zA-Z0-9._]+@[a-zA-Z0-9._]$"))) return false
    if (!dob.matches(Regex("^\\d{2}/\\d{2}/\\d{4}$"))) return false
    if (!phoneNumberCountryCode.matches(Regex("^[0-9]{10}$]"))) return false // <----
    return true
}
