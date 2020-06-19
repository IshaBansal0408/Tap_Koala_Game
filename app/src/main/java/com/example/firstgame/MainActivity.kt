package com.example.firstgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.attribute.AclFileAttributeView
import kotlin.random.Random
import android.os.Handler as Handler1

class MainActivity : AppCompatActivity(){
    var score:Int=0
    var ImagePosition=ArrayList<ImageView>()
    var ha: Handler1 = Handler1()
    var runnable:Runnable= Runnable {  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        score = 0
        ImagePosition= arrayListOf(imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,imageView11,imageView12)
        makeinvisible()
        object: CountDownTimer(20000,1000){
            override fun onFinish() {
                timeid.text="GAME OVER!!"
                ha.removeCallbacks(runnable)
                for(img in ImagePosition){
                    img.visibility=View.INVISIBLE
                }

            }

            override fun onTick(p0: Long) {
                timeid.text="TIMER: "+p0/1000
            }

        }.start()
    }
    fun makeinvisible(){

        runnable=object:Runnable{
            override fun run() {
                for(img in ImagePosition){
                    img.visibility=View.INVISIBLE
                }
                val cur_index=Random.nextInt(11 - 0);
                ImagePosition[cur_index].visibility=View.VISIBLE
                ha.postDelayed(runnable,500)
            }

        }
        ha.post(runnable);
    }
    fun increaseScore(view: View){
        score+=5

        scoreid.text="SCORE: "+score
    }
    fun Restart (view: View){
            score=0
            scoreid.text="SCORE: 0"
            timeid.text="TIME: 20"
            finish();
            startActivity(getIntent());

    }
}