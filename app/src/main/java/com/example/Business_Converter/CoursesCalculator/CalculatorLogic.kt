package com.example.Business_Converter.CoursesCalculator

import android.annotation.SuppressLint
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import java.math.BigDecimal
import java.math.RoundingMode

class CalculatorLogic {

    companion object {
        @SuppressLint("SetTextI18n")
        fun chfButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeCHF.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText CHF = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate CHF"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun eurButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeEUR.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText EUR = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate EUR"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun thbButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeTHB.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText THB = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate THB"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun usdButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeUSD.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText USD = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate USD"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun audButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeAUD.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText AUD = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate AUD"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun hkdButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeHKD.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText HKD = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate HKD"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun cadButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeCAD.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText CAD = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate CAD"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun nzdButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeNZD.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText NZD = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate NZD"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun sgdButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeSGD.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText SGD = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate SGD"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun hufButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeHUF.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText HUF = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate HUF"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun gbpButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeGBP.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText GBP = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate GBP"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun uahButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeUAH.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText UAH = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate UAH"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun jpyButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeJPY.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText JPY = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate JPY"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun czkButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeCZK.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText CZK = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate CZK"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun dkkButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeDKK.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText DKK = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate DKK"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun iskButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeISK.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText ISK = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate ISK"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun nokButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeNOK.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText NOK = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate NOK"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun sekButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeSEK.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText SEK = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate SEK"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun hrkButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeHRK.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText HRK = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate HRK"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun ronButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeRON.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText RON = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate RON"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun bgnButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeBGN.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText BGN = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate BGN"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun tryButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeTRY.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText TRY = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate TRY"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun ilsButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeILS.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText ILS = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate ILS"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun clpButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeCLP.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText CLP = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate CLP"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun phpButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponePHP.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText PHP = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate PHP"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun mxnButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeMXN.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText MXN = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate MXN"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun zarButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeZAR.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText ZAR = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate ZAR"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun brlButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeBRL.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText BRL = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate BRL"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun myrButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeMYR.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText MYR = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate MYR"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun rubButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeRUB.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText RUB = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate RUB"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun idrButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeIDR.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText IDR = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate IDR"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun inrButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeINR.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText INR = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate INR"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun krwButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeKRW.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText KRW = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate KRW"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }

        @SuppressLint("SetTextI18n")
        fun cnyButtonLogic(viewModel: CoursesCalculatorViewModel, textViewPLN: TextView, textViewOther: TextView, editText: EditText, context: CoursesConverterActivity) {

            context.applicationContext
            val editText = editText.text.toString()
            if (editText.length > 0) {
                val newEditText = BigDecimal(editText).setScale(4, RoundingMode.HALF_EVEN)
                viewModel.singleRateResponeCNY.observe(context, Observer { response ->
                    if (response.isSuccessful) {
                        response.body()?.rates?.forEach {
                            val toOtherrate  = (newEditText / it.mid)
                            val toPLNrate  = BigDecimal((it.mid * newEditText).toString()).setScale(4,RoundingMode.HALF_EVEN)
                            textViewPLN.text = "$newEditText CNY = $toPLNrate PLN"
                            textViewOther.text = "$newEditText PLN = $toOtherrate CNY"
                        }

                    } else {
                        textViewPLN.text = "Error"
                    }

                })
            } else {
                textViewPLN.text = "Nic nie wpisałeś"
                textViewOther.text = "Nic nie wpisałeś"
            }

        }




    }

}


