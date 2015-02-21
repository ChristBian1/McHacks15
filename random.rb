require 'contextio'

contextio = ContextIO.new('2p7nrfhj', 'UPTnTm1jPi4DOzjR')

some_account_id = "54e8b825f1620c601be3f144"

account = contextio.accounts[some_account_id]
message = account.messages[some_message_id]