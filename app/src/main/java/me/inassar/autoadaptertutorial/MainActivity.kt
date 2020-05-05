package me.inassar.autoadaptertutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

    private fun initRecycler() {
        personRecycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PersonAdapter(
                listOf(
                    Person("Big Bird", "123 Seasame Street"),
                    Person("Kermit the Frog", "6801 Hollywood Blvd.")
                )
            )
        }
    }
}
