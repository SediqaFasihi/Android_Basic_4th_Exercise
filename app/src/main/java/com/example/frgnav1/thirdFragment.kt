package com.example.frgnav1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.frgnav1.databinding.FragmentFirstBinding
import com.example.frgnav1.databinding.FragmentThirdBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [thirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class thirdFragment : Fragment() {

    private var binding : FragmentThirdBinding? = null
    val binding2 get() = binding

    val listOfPeople = listOf(
        Person1( R.mipmap.person_1,"Sediqa", "Fasihi"),
        Person1(R.mipmap.person_2,"Marco","Ratto"),
        Person1(R.mipmap.person_1,"Lorenzo","cccc"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = binding?.textListRv1
        val adopter = ThirdFragmentAdopter(listOfPeople)
        list?.adapter = adopter
        list?.layoutManager = LinearLayoutManager(context)
    }

}
