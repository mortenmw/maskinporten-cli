package no.kommune.oslo.maskinporten.cli

import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required

class ListClientKeysCommand : AdminCommand(name = "keys") {
    private val clientId by option().required()

    override fun run() {
        super.run()

        val clientKeys = getAdminClient().getClientKeys(clientId)
        println(clientKeys)
    }

}

