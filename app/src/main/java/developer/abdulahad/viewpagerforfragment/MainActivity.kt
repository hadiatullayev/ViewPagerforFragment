package developer.abdulahad.viewpagerforfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import developer.abdulahad.viewpagerforfragment.adapter.FragmentAdapter
import developer.abdulahad.viewpagerforfragment.adapter.MyViewPagerAdapter
import developer.abdulahad.viewpagerforfragment.databinding.ActivityMainBinding
import developer.abdulahad.viewpagerforfragment.models.User

class MainActivity : AppCompatActivity() {
    lateinit var fragmentadapter: FragmentAdapter
    lateinit var binding: ActivityMainBinding
    lateinit var myViewPagerAdapter: MyViewPagerAdapter
    lateinit var list: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
    }

    private fun loadData() {
        list = ArrayList()

        list.add(User("Google","https://dobralama.com.ua/catalog/view/theme/tt_oregon1/img/ico_google.png"))
        list.add(User("Apple","https://pngshare.com/wp-content/uploads/2021/06/Apple-Logo-Transparent-12.png"))
        list.add(User("Kotlin","https://codial.netlify.app/img/kotlin.png"))
        list.add(User("Android","https://codial.netlify.app/img/android.png"))

//        myViewPagerAdapter = MyViewPagerAdapter(this, list)
//        binding.viewPager.adapter = myViewPagerAdapter
        fragmentadapter = FragmentAdapter(supportFragmentManager,list)
        binding.viewPager.adapter = fragmentadapter
    }
}