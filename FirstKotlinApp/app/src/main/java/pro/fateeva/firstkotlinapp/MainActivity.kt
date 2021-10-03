package pro.fateeva.firstkotlinapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var fateeva: Person = Person("Рита", "Фатеева")
    var copyFateeva = fateeva.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        var angryButton: Button = findViewById(R.id.angry_button)
        angryButton.setOnClickListener { angryButtonClicked() }

        var personButton: Button = findViewById(R.id.person_button)
        personButton.setOnClickListener { personButtonClicked() }

        var personCopyButton: Button = findViewById(R.id.person_copy_button)
        personCopyButton.setOnClickListener { copyPersonButtonClicked() }

        val list = listOf(
                1, 2, 31, 5, 124, 1, 12
        )

        for (item in list) {
            Log.d("null", "Item $item")
        }

        for (i in 1..10) {
            Log.d(null, "Сообщение #" + i)
        }

        for (i in 10 downTo 1 step 2) {
            Log.d(null, "Сообщение #" + i)
        }

        for (i in 0 until list.size) {
            if (list[i] % 2 == 0) {
                Log.d(null, list[i].toString() + " - чётное")
            }
        }

    }

    private fun angryButtonClicked() {
        Toast.makeText(this, "Ну просили же!", Toast.LENGTH_SHORT).show()
    }

    data class Person(val name: String, val surname: String)

    private fun personButtonClicked() {
        Toast.makeText(this, fateeva.name + " " + fateeva.surname, Toast.LENGTH_SHORT).show()
    }

    private fun copyPersonButtonClicked() {
        Toast.makeText(this, "Копия: " + copyFateeva.name + " " + copyFateeva.surname, Toast.LENGTH_SHORT).show()
    }
}