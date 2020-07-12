package ru.ought.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import ru.ought.geoquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.setOnClickListener { onClickTrue() }
        binding.falseButton.setOnClickListener { onClickFalse() }
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
