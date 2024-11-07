import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviewpeoject2.R
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context: Activity, val arrayList: ArrayList<User> ) :
    ArrayAdapter<User>(context, R.layout.coustom_list,arrayList){
    // Inheriting the properties of default arrayAdapter
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.coustom_list,null)
        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.textView)
        val lastmsg = view.findViewById<TextView>(R.id.textView2)
        val lastmsgtime = view.findViewById<TextView>(R.id.textView3)
        name.text=arrayList[position].Name
        lastmsg.text=arrayList[position].LastMsg
        lastmsgtime.text=arrayList[position].lastMsgTime
        image.setImageResource(arrayList[position].imageId)
        return view
    }

}