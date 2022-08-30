package cvb.com.br.desafio_fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class Fragment_1 : Fragment(R.layout.fragment_1) {

    companion object {
        fun newInstance(): Fragment_1 {
            return Fragment_1()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.bt_oi).setOnClickListener {
            val frag = Fragment_2.newInstance("Vai dar certo!!!")

            showFragment(frag)
        }
    }

    private fun showFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .add(R.id.fragment_main, fragment)
            .addToBackStack(null)
            .commit()
    }
}