package cvb.com.br.desafio_fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment_2 : Fragment(R.layout.fragment_2) {

    companion object {
        private const val EXTRA_INFO = "EXTRA_INFO"

        fun newInstance(msg: String): Fragment_2 {
            val fragment = Fragment_2()

            val bundle = Bundle()
            bundle.putString(EXTRA_INFO, msg)

            fragment.arguments = bundle

            return fragment
        }
    }

    private lateinit var info: String;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadExtras(this.requireArguments())

        view.findViewById<TextView>(R.id.tv_info).text = info
        view.findViewById<TextView>(R.id.tv_info).setOnClickListener {
            Toast.makeText(requireActivity(), "Teste!!", Toast.LENGTH_SHORT).show()
            parentFragmentManager.popBackStack()
        }
    }

    private fun loadExtras(bundle: Bundle) {
        info = bundle.getString(EXTRA_INFO)!!
    }

}