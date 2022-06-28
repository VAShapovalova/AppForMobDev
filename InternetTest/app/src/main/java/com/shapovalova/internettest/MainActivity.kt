package com.shapovalova.internettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

class MainActivity : AppCompatActivity() {
    val url =
        URL("https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=ff49fcd4d4a08aa6aafb6ea3de826464&tags=cat&format=json&nojsoncallback=1")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHttp = findViewById<Button>(R.id.btnHTTP)
        val btnOkHttp = findViewById<Button>(R.id.btnOkHTTP)

        btnHttp.setOnClickListener {
             val thread = Thread {
                 var urlConnection: HttpURLConnection? = null
                 var reader: BufferedReader? = null
                 try {
                     urlConnection = url.openConnection() as HttpURLConnection
                     urlConnection.requestMethod = "GET"
                     urlConnection.connect()
                     val inputStream = urlConnection.inputStream
                     val a = inputStream.bufferedReader().use {it.readText() }
                     Log.v("Flickr cats", a)
                 } catch (e: IOException) {
                     Log.e("Request", "Error ", e)
                     return@Thread
                 } finally {

                     urlConnection?.disconnect()
                     if (reader != null) {
                         try {
                             reader.close();
                         } catch (e: IOException) {
                             Log.e("Flickr Cats Error", "Error closing stream", e);
                         }
                     }
                 }
             }
             thread.start()
         }

        btnOkHttp.setOnClickListener {
            val thread = Thread {
                val client = OkHttpClient()
                val request = Request.Builder()
                    .url(url)
                    .build();

                try {
                    val response: Response = client.newCall(request).execute()
                    Log.i("Flickr OkCats", response.body()!!.string())
                } catch (e: IOException) {
                    Log.e("Flickr OkCats Error", "Error ", e)
                }
            }
            thread.start()
        }
    }
}