package com.chilangolabs.capitallab

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Toast
import com.chilangolabs.capitallab.OwnElements.NothingSelectedSpinnerAdapter
import kotlinx.android.synthetic.main.activity_prestamo_info.*

class PrestamoInfoActivity : AppCompatActivity() {


    var progressGl = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prestamo_info)

        toolbar.title = ""
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val categorias: Array<String> = arrayOf("6 meses", "12 meses", "24 meses", "48 meses")

        val adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categorias)

        spinnerCategoria.adapter = NothingSelectedSpinnerAdapter(adapter, R.layout.item_nothing_selected, this)

        seeker.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

            override fun onProgressChanged(seekbar: SeekBar?, progress: Int, fromUser: Boolean) {
                txtMoney.text = """${'$'}$progress"""
                progressGl = progressGl
            }

        })

        btnPrestamo.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
                    .setTitle("Prestamo")
                    .setMessage("""Estas seguro que necesitas ${txtMoney.text} para ${edtxNecesitoUnPrestamo.text} a ${categorias[spinnerCategoria.selectedItemPosition - 1]}?""")
                    .setPositiveButton("Estoy Seguro", { dialogInterface, i ->
                        dialogInterface.dismiss()
                        finish()
                        Toast.makeText(this, "Tu solicitud esta siendo procesada", Toast.LENGTH_LONG).show()
                    })
                    .setNegativeButton("Cancelar", { dialogInterface, i ->
                        dialogInterface.dismiss()
                    })
                    .create()
            dialog.show()
            dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(resources.getColor(R.color.colorPrimary))
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(resources.getColor(R.color.colorPrimary))
        }

    }
}
