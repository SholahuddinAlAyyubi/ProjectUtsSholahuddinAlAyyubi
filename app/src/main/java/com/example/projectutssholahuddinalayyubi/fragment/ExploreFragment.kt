package com.example.projectutssholahuddinalayyubi.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectutssholahuddinalayyubi.DetailMovieActivity
import com.example.projectutssholahuddinalayyubi.Movie
import com.example.projectutssholahuddinalayyubi.MovieAdapter
import com.example.projectutssholahuddinalayyubi.R

class ExploreFragment : Fragment() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var adapter : MovieAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieArrayList : ArrayList<Movie>

    lateinit var image: Array<Int>
    lateinit var title: Array<String>
    lateinit var descriptions: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_movie)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = context?.let {
            MovieAdapter(it, movieArrayList){
                val intent = Intent(context, DetailMovieActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
            }
        }

    }

    private fun dataInitialize() {
        movieArrayList = arrayListOf<Movie>()

        image = arrayOf(
            R.drawable.ally,
            R.drawable.claymore2,
            R.drawable.eye,
            R.drawable.delta,
            R.drawable.falchion,
            R.drawable.flow,
            R.drawable.phone5,
            R.drawable.scar17,
            R.drawable.strixg15,
            R.drawable.zephyrusg15,


            )

        title = arrayOf(
            "ROG - ALLY",
            "ROG - CLAYMORE 2",
            "ROG - EYE",
            "ROG - DELTA",
            "ROG - FALCHION",
            "ROG - FLOW",
            "ROG - PHONE 5",
            "ROG - SCAR 17",
            "ROG - STRIX G15",
            "ROG - ZEPHYRUS G15",

            )

        descriptions = arrayOf(
            "Dengan menjalankan Windows 11, Asus ROG Ally bisa digunakan untuk memainkan game dari berbagai platform, mulai dari Xbox, Steam, Epic Games, EA Play, GoG Galaxy, hingga Ubisoft Connect. Lantaran dibekali Armoury Crate Special Edition (SE gamers dapat mengakses semua game sekaligus mengatur profile untuk setiap game kesayangannya.\n" +
                    "\n" +
                    "Agar game dapat dimainkan dengan lancar, Asus ROG Ally ditenagai oleh prosesor AMD Ryzen Z1 Series terbaru dipadukan RAM LPDDR5 16 GB 6400Mz, penyimpanan NVMe M.2 2230 PCIe Gen 4 sebesar 512 GB.\n" +
                    "\n" +
                    "Baca artikel detikinet, \"Asus ROG Ally Bawa Spek Sadis Harga Masih Terjangkau, Masuk Indonesia?\" selengkapnya https://inet.detik.com/consumer/d-6718463/asus-rog-ally-bawa-spek-sadis-harga-masih-terjangkau-masuk-indonesia.\n" +
                    "\n",

            "Keyboard mekanik elit untuk gaming, ROG Claymore II, dengan ROG RX Optical Mechanical Switches, numpad yang dapat dilepas, mode kabel & nirkabel 2,4G, tambahan hotkey klik yang dapat disesuaikan, roda kontrol volume, Aura Sync nirkabel, dan sandaran pergelangan magnetis yang dapat dilepas.\n" +
                    "Bermain dengan Cara Anda: Numpad yang dapat dilepas bisa dipasangkan ke sisi 80% keyboard untuk menyesuaikan gaya bermain dan pengaturan game Anda\n" +
                    "ROG RX Optical Mechanical Switches: Switch RX Red dan RX Blue memiliki pencahayaan terpusat dan memberikan penekanan tombol tanpa goyang dan konsisten dengan penundaan debounce mendekati nol\n" +
                    "Pelajari selengkapnya tentang ROG RX Keyboard Switch\n" +
                    "Koneksi Bebas Lag: Respons super cepat 1 mdtk dalam mode kabel atau nirkabel 2,4 GHz\n" +
                    "Masa Pakai Baterai Super Lama: Baterai 4000 mAh menghadirkan penggunaan hingga 47 jam (ukuran penuh dengan cahaya hidup), dan keyboard memiliki indikator LED internal tingkat baterai",


            "ROG Eye USB camera with Full HD 1080p streaming at 60fps, Face AE technology, and beamforming microphone for high streaming video and audio quality\n" +
                    "Crisp, Full HD (1080p) 60FPS output provides detailed and smooth video quality\n" +
                    "Brighter and clearer face views with Face Auto Exposure technology\n" +
                    "WDR technology and blue glass prevents infrared light and overexposure in backlit conditions\n" +
                    "Stream with clear voice quality with a beamforming microphone\n" +
                    "Compact and foldable design that’s just 17mm thin slips easily into a pocket and attaches to laptops securely",

            "RGB gaming headset with Hi-Res ESS Quad-DAC, circular RGB lighting effect and USB-C connector for PCs, consoles and mobile gaming\n" +
                    "Industry-leading hi-res ESS quad-DAC for impeccably detailed and true-to-life audio\n" +
                    "USB-C connector for true multiplatform support, including PCs, Mac, mobile phones and PS4*\n" +
                    "Customizable, multi-color circular RGB lighting lets you shine in style\n" +
                    "Exclusive ASUS Essence drivers, airtight chamber and audio signal diversion technology for immersive audio experiences\n" +
                    "Upgraded comfort with ergonomic D-shape and ROG Hybrid ear cushions",

            "ROG Falchion 65% wireless mechanical gaming keyboard with 68 keys, wireless Aura Sync lighting, interactive touch panel, keyboard cover case, Cherry MX switches, and up to 450-hour battery life\n" +
                    "Compact 65% layout masterfully incorporates arrow and navigation keys, in a 60% keyboard frame\n" +
                    "Interactive touch panel makes it easy to adjust and customize controls\n" +
                    "Dual-mode connectivity via wired USB and 1 ms at 2.4 GHz RF, and up to 450 hours of battery life* offer stable, long-lasting performance (*with RGB lighting off)\n" +
                    "Durable and long-lasting ROG PBT doubleshot keycaps (keycap material may vary by region)\n" +
                    "Innovative keyboard cover case provides on-the-go protection\n" +
                    "First ROG keyboard to feature wireless Aura Sync with per-key RGB lighting\n" +
                    "German-made Cherry MX RGB mechanical switches for precision input",

            "Prosesor hingga 14-core Intel® Core™ i9-12900H, GPU Laptop GeForce RTX™ 3050 Ti dan sebuah MUX Switch\n" +
                    "ROG Flow Z13 Icons – XG Mobile\n" +
                    "yang didedikasikan untuk ROG Flow Z13. Perangkat ini dapat digunakan untuk berbagai tipe input dan peningkatan grafis dengan XG Mobile.\n" +
                    "ROG Flow Z13 Icons – Cooling\n" +
                    "Sebuah layar sentuh dengan rasio 16:10 membebaskan kreativitasmu, dengan opsi refresh rate 120Hz atau 4K.\n" +
                    "ROG Flow Z13 – Versatility\n" +
                    "Nikmati fleksibilitas yang luar biasa dengan penyangga yang dapat disesuaikan hingga 170° dan keyboard yang dapat dilepas pasang.\n" +
                    "ROG Flow Z13 Icons – Thin & Light\n" +
                    "Semua ini ada pada sasis yang sangat ringan, hanya 1.1kg dan setipis 12mm.",

            "Qualcomm® Snapdragon™ 888 5G Mobile Platform\n" +
                    "Qualcomm® Adreno™ 660\n" +
                    "Qualcomm® Snapdragon™ 888 5G Mobile Platform\n" +
                    "Memori\n" +
                    "LPDDR5 12GB\n" +
                    "Penyimpanan\n" +
                    "UFS3.1 256GB\n" +
                    "Layar\n" +
                    "6.78\" 20.4:9 (2448 x 1080) Samsung AMOLED. Corning® Gorilla® Glass Victus. Delta-E < 1",

            "12th Gen Intel® Core™ i9-12950HX Processor 2.3 GHz (30M Cache, up to 5.0 GHz, 16 cores: 8 P-cores and 8 E-cores)\t\n" +
                    "12th Gen Intel® Core™ i9-12950HX Processor 2.3 GHz (30M Cache, up to 5.0 GHz, 16 cores: 8 P-cores and 8 E-cores)\t\n" +
                    "Grafis\n" +
                    "NVIDIA® GeForce RTX™ 3070 Ti Laptop GPU\n" +
                    "ROG Boost: 1460MHz* at 150W (1410MHz Boost Clock+50MHz OC, 125W+25W Dynamic Boost)\n" +
                    "8GB GDDR6",

            "AMD Ryzen™ 7 6800H/HS Mobile Processor (8-core/16-thread, 20MB cache, up to 4.7 GHz max boost)\n" +
                    "AMD Ryzen™ 7 6800H/HS Mobile Processor (8-core/16-thread, 20MB cache, up to 4.7 GHz max boost)\n" +
                    "Grafis\n" +
                    "NVIDIA® GeForce RTX™ 3050 Laptop GPU\n" +
                    "ROG Boost: 1550MHz* at 95W (1500MHz Boost Clock+50MHz OC, 80W+15W Dynamic Boost)\n" +
                    "4GB GDDR6",

            "AMD Ryzen™ 9 6900HS Mobile Processor (8-core/16-thread, 16MB cache, up to 4.9 GHz max boost)\n" +
                    "AMD Ryzen™ 9 6900HS Mobile Processor (8-core/16-thread, 16MB cache, up to 4.9 GHz max boost)\n" +
                    "Grafis\n" +
                    "NVIDIA® GeForce RTX™ 3060 Laptop GPU\n" +
                    "ROG Boost: 1475MHz* at 120W (1425MHz Boost Clock+50MHz OC, 100W+20W Dynamic Boost)\n" +
                    "6GB GDDR6",

        )

        for (i in image.indices) {

            val movie = Movie(image[i],title[i], descriptions[i])
            movieArrayList.add(movie)
        }

    }

}