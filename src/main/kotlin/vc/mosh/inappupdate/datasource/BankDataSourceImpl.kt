package vc.mosh.inappupdate.datasource

import org.springframework.stereotype.Repository
import vc.mosh.inappupdate.model.Bank

@Repository
class BankDataSourceImpl() : BankDataSource {

    override fun getBanks(): Collection<Bank> = Bank.listOfBanks

}