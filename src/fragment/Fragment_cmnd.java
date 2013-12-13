package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jsoncorp.demoviewpager.R;

public class Fragment_cmnd extends Fragment_page {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_cmnd, container, false);
		
		/**
		 * Doan code ben duoi cho phep ban dung animation flip 3D
		 * Video : http://www.youtube.com/watch?v=52mXHqX9f3Y
		 * Note: De chay doan code ben duoi, ban can bo command trong xml file
		 */
		
		/*final ViewFlipper viewFliper = (ViewFlipper) view
				.findViewById(R.id.viewFlipper);
		
		ImageView img1 = (ImageView) view.findViewById(R.id.imageView1);
		ImageView img2 = (ImageView) view.findViewById(R.id.imageView2);

		img1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				AnimationFactory.flipTransition(viewFliper,
						FlipDirection.LEFT_RIGHT);
			}
		});

		img2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				AnimationFactory.flipTransition(viewFliper,
						FlipDirection.LEFT_RIGHT);
			}
		});*/

		return view;
	}
}
