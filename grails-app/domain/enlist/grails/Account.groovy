package enlist.grails

class Account {
	User owner
	def transactions
	def balance = 0.0

	def dateCreated
	def lastUpdated

	static belongsTo = [owner: User]

	static constraints = {
		owner(nullable: false)
	}

	static hasMany = [transactions: Transfer]
}
