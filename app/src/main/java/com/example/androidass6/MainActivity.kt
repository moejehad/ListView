package com.example.androidass6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.androidass6.adapter.RecipesAdapter
import com.example.androidass6.model.Recipes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<Recipes>()
        data.add(Recipes(1,R.drawable.img1,"Crunchy Croissants","Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        data.add(Recipes(2,R.drawable.img2,"Grilled Eggplant","Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        data.add(Recipes(3,R.drawable.img3,"Tangerine Salad","Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        data.add(Recipes(4,R.drawable.img1,"Pomegranate Juice","Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        data.add(Recipes(5,R.drawable.img2,"Chili Salsa","Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        data.add(Recipes(6,R.drawable.img3,"Flour from scratch","Lorem ipsum dolor sit amet, consectetur adipiscing elit"))

        val recipesAdapter = RecipesAdapter(this,data)
        listViewHome.adapter = recipesAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.share -> Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show()
            R.id.save -> Toast.makeText(this,"save",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}