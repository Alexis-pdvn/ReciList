package fr.iutlens.bucamppodevin.recilist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.iutlens.bucamppodevin.recilist.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recette_pain.*

class PagePain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recette_pain)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.vosRecettes -> {
                    val intent = Intent (this, MainActivity::class.java);
                    startActivity(intent);
                    true
                }
                else -> false
            }
        }
    }
}