package ru.ought.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ru.ought.geoquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.trueButton.setOnClickListener { onClickTrue() }
        b.falseButton.setOnClickListener { onClickFalse() }
    }

    private fun onClickTrue() {
        makeToast(R.string.correct_toast)
    }

    private fun onClickFalse() {
        makeToast(R.string.incorrect_toast)
    }

    private fun makeToast(id: Int) {
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show()
    }
}
