package jp.threecolors.sample.samplemvvm

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.threecolors.sample.samplemvvm.databinding.SampleFragmentBinding

class SampleFragment : Fragment() {
    private lateinit var binding: SampleFragmentBinding
    private lateinit var viewModel: SampleViewModel

    companion object {
        fun newInstance() = SampleFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.sample_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(activity as FragmentActivity).get(SampleViewModel::class.java)

        binding.setLifecycleOwner(this)
        binding.viewModel = viewModel
        binding.clickCallback = clickCallback
    }

	val clickCallback = object : ClickCallback {
		override fun onClickAdd() {
            viewModel.add()
		}

		override fun onClickSub() {
            viewModel.sub()
		}

	}

	interface ClickCallback {
		fun onClickAdd()
		fun onClickSub()
	}
}
