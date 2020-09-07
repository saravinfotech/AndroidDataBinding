package pluralsight.com.tabiangifts;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pluralsight.com.tabiangifts.databinding.FragmentViewProductBinding;
import pluralsight.com.tabiangifts.util.Products;


/**
 * Created by User on 2/6/2018.
 */

public class ViewProductFragment extends Fragment {

    private static final String TAG = "ViewProductFragment";

    // Data binding
    FragmentViewProductBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentViewProductBinding.inflate(inflater);

        Products products = new Products();
        mBinding.setProduct(products.PRODUCTS[0]);

        mBinding.setQty(1);

        return mBinding.getRoot();
    }

}














