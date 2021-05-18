package com.example.Business_Converter.CoursesCalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.Business_Converter.R
import com.example.Business_Converter.network.Repository

class CoursesConverterActivity : AppCompatActivity() {

    private lateinit var viewModel: CoursesCalculatorViewModel
    private lateinit var coursesConverterActivity: CoursesConverterActivity
    private lateinit var editText: EditText
    private lateinit var textViewtoPLN: TextView
    private lateinit var textViewfromPLN: TextView
    private lateinit var chfButton: Button
    private lateinit var eurButton: Button
    private lateinit var usdButton: Button
    private lateinit var thbButton: Button
    private lateinit var audButton: Button
    private lateinit var hkdButton: Button
    private lateinit var cadButton: Button
    private lateinit var nzdButton: Button
    private lateinit var sgdButton: Button
    private lateinit var hufButton: Button
    private lateinit var gbpButton: Button
    private lateinit var uahButton: Button
    private lateinit var jpyButton: Button
    private lateinit var czkButton: Button
    private lateinit var dkkButton: Button
    private lateinit var iskButton: Button
    private lateinit var nokButton: Button
    private lateinit var sekButton: Button
    private lateinit var hrkButton: Button
    private lateinit var ronButton: Button
    private lateinit var bgnButton: Button
    private lateinit var tryButton: Button
    private lateinit var ilsButton: Button
    private lateinit var clpButton: Button
    private lateinit var phpButton: Button
    private lateinit var mxnButton: Button
    private lateinit var zarButton: Button
    private lateinit var brlButton: Button
    private lateinit var myrButton: Button
    private lateinit var rubButton: Button
    private lateinit var idrButton: Button
    private lateinit var inrButton: Button
    private lateinit var krwButton: Button
    private lateinit var cnyButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_converter)

        editText = findViewById(R.id.CalculatorEditText)
        textViewtoPLN = findViewById(R.id.CalculatorTextViewPLN)
        textViewfromPLN = findViewById(R.id.CalculatorTextViewOther)
        chfButton = findViewById(R.id.buttonCHF)
        eurButton = findViewById(R.id.buttonEUR)
        usdButton = findViewById(R.id.buttonUSD)
        thbButton = findViewById(R.id.buttonTHB)
        audButton = findViewById(R.id.buttonAUD)
        hkdButton = findViewById(R.id.buttonHKD)
        cadButton = findViewById(R.id.buttonCAD)
        nzdButton = findViewById(R.id.buttonNZD)
        sgdButton = findViewById(R.id.buttonSGD)
        hufButton = findViewById(R.id.buttonHUF)
        gbpButton = findViewById(R.id.buttonGBP)
        uahButton = findViewById(R.id.buttonUAH)
        jpyButton = findViewById(R.id.buttonJPY)
        czkButton = findViewById(R.id.buttonCZK)
        dkkButton = findViewById(R.id.buttonDKK)
        iskButton = findViewById(R.id.buttonISK)
        nokButton = findViewById(R.id.buttonNOK)
        sekButton = findViewById(R.id.buttonSEK)
        hrkButton = findViewById(R.id.buttonHRK)
        ronButton = findViewById(R.id.buttonRON)
        bgnButton = findViewById(R.id.buttonBGN)
        tryButton = findViewById(R.id.buttonTRY)
        ilsButton = findViewById(R.id.buttonILS)
        clpButton = findViewById(R.id.buttonCLP)
        phpButton = findViewById(R.id.buttonPHP)
        mxnButton = findViewById(R.id.buttonMXN)
        zarButton = findViewById(R.id.buttonZAR)
        brlButton = findViewById(R.id.buttonBRL)
        myrButton = findViewById(R.id.buttonMYR)
        rubButton = findViewById(R.id.buttonRUB)
        idrButton = findViewById(R.id.buttonIDR)
        inrButton = findViewById(R.id.buttonINR)
        krwButton = findViewById(R.id.buttonKRW)
        cnyButton = findViewById(R.id.buttonCNY)



        val repository = Repository()
        val logic = CalculatorLogic
        val viewModelFactory = CoursesCalculatorViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(CoursesCalculatorViewModel::class.java)
        viewModel.getCHF()
        viewModel.getEUR()
        viewModel.getAUD()
        viewModel.getTHB()
        viewModel.getUSD()
        viewModel.getHKD()
        viewModel.getCAD()
        viewModel.getNZD()
        viewModel.getSGD()
        viewModel.getHUF()
        viewModel.getGBP()
        viewModel.getUAH()
        viewModel.getJPY()
        viewModel.getCZK()
        viewModel.getDKK()
        viewModel.getISK()
        viewModel.getNOK()
        viewModel.getSEK()
        viewModel.getHRK()
        viewModel.getRON()
        viewModel.getBGN()
        viewModel.getTRY()
        viewModel.getILS()
        viewModel.getCLP()
        viewModel.getPHP()
        viewModel.getMXN()
        viewModel.getZAR()
        viewModel.getBRL()
        viewModel.getMYR()
        viewModel.getRUB()
        viewModel.getIDR()
        viewModel.getINR()
        viewModel.getKRW()
        viewModel.getCNY()

        chfButton.setOnClickListener {
                logic.chfButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        eurButton.setOnClickListener {
            logic.eurButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        thbButton.setOnClickListener {
            logic.thbButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        usdButton.setOnClickListener {
            logic.usdButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        audButton.setOnClickListener {
            logic.audButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        hkdButton.setOnClickListener {
            logic.hkdButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        cadButton.setOnClickListener {
            logic.cadButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        nzdButton.setOnClickListener {
            logic.nzdButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        sgdButton.setOnClickListener {
            logic.sgdButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        hufButton.setOnClickListener {
            logic.hufButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        gbpButton.setOnClickListener {
            logic.gbpButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        uahButton.setOnClickListener {
            logic.uahButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        jpyButton.setOnClickListener {
            logic.jpyButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        czkButton.setOnClickListener {
            logic.czkButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        dkkButton.setOnClickListener {
            logic.dkkButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        iskButton.setOnClickListener {
            logic.iskButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        nokButton.setOnClickListener {
            logic.nokButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        sekButton.setOnClickListener {
            logic.sekButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        hrkButton.setOnClickListener {
            logic.hrkButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        ronButton.setOnClickListener {
            logic.ronButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        bgnButton.setOnClickListener {
            logic.bgnButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        tryButton.setOnClickListener {
            logic.tryButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        ilsButton.setOnClickListener {
            logic.ilsButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        clpButton.setOnClickListener {
            logic.clpButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        phpButton.setOnClickListener {
            logic.phpButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        mxnButton.setOnClickListener {
            logic.mxnButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        zarButton.setOnClickListener {
            logic.zarButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        brlButton.setOnClickListener {
            logic.brlButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        myrButton.setOnClickListener {
            logic.myrButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        rubButton.setOnClickListener {
            logic.rubButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        idrButton.setOnClickListener {
            logic.idrButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        inrButton.setOnClickListener {
            logic.inrButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        krwButton.setOnClickListener {
            logic.krwButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

        cnyButton.setOnClickListener {
            logic.cnyButtonLogic(textViewPLN = textViewtoPLN, textViewOther = textViewfromPLN, viewModel = viewModel, context = this, editText = editText )
        }

    }
}