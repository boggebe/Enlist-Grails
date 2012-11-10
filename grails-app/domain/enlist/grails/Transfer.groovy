package enlist.grails

class Transfer {

	def Account fromAccount
	def Account toAccount
	def amount

	def dateCreated
	def lastUpdated

	static constraints = {
		fromAccount(nullable: false)
		toAccount(nullable: false)
	}
}
