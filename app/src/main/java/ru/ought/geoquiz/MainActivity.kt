package ru.ought.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.setOnClickListener(this::onClickTrue)
        binding.falseButton.setOnClickListener(this::onClickFalse)
    }

    private fun onClickTrue(view: View?) {
        makeToast(R.string.correct_toast)
    }

    private fun onClickFalse(view: View?) {
        makeToast(R.string.incorrect_toast)
    }

    private fun makeToast(id: Int) {
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show()
    }
}
