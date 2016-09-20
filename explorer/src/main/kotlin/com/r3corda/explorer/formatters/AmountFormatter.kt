package com.r3corda.explorer.formatters

import com.r3corda.core.contracts.Amount
import java.util.Currency

/**
 * A note on formatting: Currently we don't have any fancy locale/use-case-specific formatting of amounts. This is a
 * non-trivial problem that requires substantial work.
 * Libraries to evaluate: IBM ICU currency library, github.com/mfornos/humanize, JSR 354 ref. implementation
 */

object AmountFormatter {
    // TODO replace this once we settled on how we do formatting
    val boring = object : Formatter<Amount<Currency>> {
        override fun format(value: Amount<Currency>) = "${value.quantity} ${value.token}"
    }
}
