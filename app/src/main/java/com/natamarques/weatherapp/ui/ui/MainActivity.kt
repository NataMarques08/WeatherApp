package com.natamarques.weatherapp.ui.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.natamarques.weatherapp.R
import com.natamarques.weatherapp.databinding.ActivityMainBinding
import com.natamarques.weatherapp.ui.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel : WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel.weatherResp.observe(this,{weather ->
            binding.apply {
                tvCityName.text = "São Paulo"
                tvTemperature.text = weather.temperature
                tvDescription.text = weather.description
                tvWind.text = weather.wind

                val forecast1 = weather.forecast[0]
                val forecast2 = weather.forecast[0]
                val forecast3 = weather.forecast[0]

                tvForecast1.text = "${forecast1.temperature} / ${forecast1.wind}"
                tvForecast2.text = "${forecast2.temperature} / ${forecast2.wind}"
                tvForecast3.text = "${forecast3.temperature} / ${forecast3.wind}"
            }
        })

    }
}