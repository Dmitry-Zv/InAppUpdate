package vc.mosh.inappupdate.service

import org.springframework.stereotype.Service
import vc.mosh.inappupdate.datasource.BankDataSource
import vc.mosh.inappupdate.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.getBanks()


}