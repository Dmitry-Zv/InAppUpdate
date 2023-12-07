package vc.mosh.inappupdate.datasource

import vc.mosh.inappupdate.model.Bank

interface BankDataSource {

    fun getBanks():Collection<Bank>
}