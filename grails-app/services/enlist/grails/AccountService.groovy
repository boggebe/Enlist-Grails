package enlist.grails

class AccountService {

	def doTransfer(Transfer transfer) {
		transfer.fromAccount.lock()
		transfer.toAccount.lock()
		transfer.fromAccount.balance -= transfer.amount
		transfer.toAccount.balance += transfer.amount
		transfer.save(failOnError: true, flush: true)
		return transfer
	}
}
