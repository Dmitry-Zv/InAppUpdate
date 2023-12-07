package vc.mosh.inappupdate.model

data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
){
    companion object{
        val listOfBanks = listOf<Bank>(
            Bank(
                "Bank_1",
                12.45,
                1
            ),
            Bank(
                "Bank_2",
                9.213,
                2
            ),
            Bank(
                "Bank_3",
                1312.45,
                3
            ),
            Bank(
                "Bank_4",
                1100.32,
                4
            )
        )
    }
}