package com.as.popdialog;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.as.popdialog.ZqfDialogAnimation.Attention.Flash;
import com.as.popdialog.ZqfDialogAnimation.Attention.RubberBand;
import com.as.popdialog.ZqfDialogAnimation.Attention.ShakeHorizontal;
import com.as.popdialog.ZqfDialogAnimation.Attention.ShakeVertical;
import com.as.popdialog.ZqfDialogAnimation.Attention.Swing;
import com.as.popdialog.ZqfDialogAnimation.Attention.Tada;
import com.as.popdialog.ZqfDialogAnimation.BaseAnimatorSet;
import com.as.popdialog.ZqfDialogAnimation.BounceEnter.BounceBottomEnter;
import com.as.popdialog.ZqfDialogAnimation.BounceEnter.BounceEnter;
import com.as.popdialog.ZqfDialogAnimation.BounceEnter.BounceLeftEnter;
import com.as.popdialog.ZqfDialogAnimation.BounceEnter.BounceRightEnter;
import com.as.popdialog.ZqfDialogAnimation.BounceEnter.BounceTopEnter;
import com.as.popdialog.ZqfDialogAnimation.FadeEnter.FadeEnter;
import com.as.popdialog.ZqfDialogAnimation.FadeExit.FadeExit;
import com.as.popdialog.ZqfDialogAnimation.FallEnter.FallEnter;
import com.as.popdialog.ZqfDialogAnimation.FallEnter.FallRotateEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipEnter.FlipBottomEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipEnter.FlipHorizontalEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipEnter.FlipHorizontalSwingEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipEnter.FlipLeftEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipEnter.FlipRightEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipEnter.FlipTopEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipEnter.FlipVerticalEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipEnter.FlipVerticalSwingEnter;
import com.as.popdialog.ZqfDialogAnimation.FlipExit.FlipHorizontalExit;
import com.as.popdialog.ZqfDialogAnimation.FlipExit.FlipVerticalExit;
import com.as.popdialog.ZqfDialogAnimation.Jelly;
import com.as.popdialog.ZqfDialogAnimation.NewsPaperEnter;
import com.as.popdialog.ZqfDialogAnimation.SlideEnter.SlideBottomEnter;
import com.as.popdialog.ZqfDialogAnimation.SlideEnter.SlideLeftEnter;
import com.as.popdialog.ZqfDialogAnimation.SlideEnter.SlideRightEnter;
import com.as.popdialog.ZqfDialogAnimation.SlideEnter.SlideTopEnter;
import com.as.popdialog.ZqfDialogAnimation.SlideExit.SlideBottomExit;
import com.as.popdialog.ZqfDialogAnimation.SlideExit.SlideLeftExit;
import com.as.popdialog.ZqfDialogAnimation.SlideExit.SlideRightExit;
import com.as.popdialog.ZqfDialogAnimation.SlideExit.SlideTopExit;
import com.as.popdialog.ZqfDialogAnimation.ZoomEnter.ZoomInBottomEnter;
import com.as.popdialog.ZqfDialogAnimation.ZoomEnter.ZoomInEnter;
import com.as.popdialog.ZqfDialogAnimation.ZoomEnter.ZoomInLeftEnter;
import com.as.popdialog.ZqfDialogAnimation.ZoomEnter.ZoomInRightEnter;
import com.as.popdialog.ZqfDialogAnimation.ZoomEnter.ZoomInTopEnter;
import com.as.popdialog.ZqfDialogAnimation.ZoomExit.ZoomInExit;
import com.as.popdialog.ZqfDialogAnimation.ZoomExit.ZoomOutBottomExit;
import com.as.popdialog.ZqfDialogAnimation.ZoomExit.ZoomOutExit;
import com.as.popdialog.ZqfDialogAnimation.ZoomExit.ZoomOutLeftExit;
import com.as.popdialog.ZqfDialogAnimation.ZoomExit.ZoomOutRightExit;
import com.as.popdialog.databinding.CustomDialogBinding;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void show(final BaseAnimatorSet anim, final String str) {
        new CenterDialog(this) {
            CustomDialogBinding bind;
            @Override
            View onCreateView() {
                widthScale(0.5f);
//                heightScale(0.8f);

//                autoDismiss(true);
//                autoDismissDelay(5000);

                showAnim(anim);
                dismissAnim(new FadeExit());

                setCanceledOnTouchOutside(true);
                dimEnabled(true);//是否设置背景黑白

                View inflate = View.inflate(MainActivity.this, R.layout.custom_dialog, null);
                bind = DataBindingUtil.bind(inflate);
                return inflate;
            }

            @Override
            void setUiBeforShow() {
                bind.tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }.show();
    }

    public void Top(View view) {
        new TopDialog(this) {
            CustomDialogBinding bind;
            @Override
            View onCreateView() {

                widthScale(0.5f);

                showAnim(new FadeEnter());
                dismissAnim(new FadeExit());

                setCanceledOnTouchOutside(true);
                dimEnabled(true);//是否设置背景黑白

                View inflate = View.inflate(MainActivity.this, R.layout.custom_dialog, null);
                bind = DataBindingUtil.bind(inflate);
                return inflate;
            }

            @Override
            void setUiBeforShow() {
                bind.tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Top", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }.show();
    }

    public void Center(View view) {
        new CenterDialog(this) {
            CustomDialogBinding bind;
            @Override
            View onCreateView() {
                widthScale(0.5f);

                showAnim(new FadeEnter());
                dismissAnim(new FadeExit());

                setCanceledOnTouchOutside(true);
                dimEnabled(true);//是否设置背景黑白

                View inflate = View.inflate(MainActivity.this, R.layout.custom_dialog, null);
                bind = DataBindingUtil.bind(inflate);
                return inflate;
            }

            @Override
            void setUiBeforShow() {
                bind.tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Center", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }.show();
    }

    public void Bottom(View view) {
        new BottomDialog(this) {
            CustomDialogBinding bind;
            @Override
            View onCreateView() {

                widthScale(0.5f);

                showAnim(new FadeEnter());
                dismissAnim(new FadeExit());

                setCanceledOnTouchOutside(true);
                dimEnabled(true);//是否设置背景黑白

                View inflate = View.inflate(MainActivity.this, R.layout.custom_dialog, null);
                bind = DataBindingUtil.bind(inflate);
                return inflate;
            }

            @Override
            void setUiBeforShow() {
                bind.tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Bottom", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }.show();
    }

    public void Flash(View view) {
        show(new Flash(),"Flash");
    }

    public void RubberBand(View view) {
        show(new RubberBand(),"RubberBand");
    }

    public void ShakeHorizontal(View view) {
        show(new ShakeHorizontal(),"ShakeHorizontal");
    }

    public void ShakeVertical(View view) {
        show(new ShakeVertical(),"ShakeVertical");
    }

    public void Swing(View view) {
        show(new Swing(),"Swing");
    }

    public void Tada(View view) {
        show(new Tada(),"Tada");
    }

    public void BounceBottomEnter(View view) {
        show(new BounceBottomEnter(),"BounceBottomEnter");
    }

    public void BounceEnter(View view) {
        show(new BounceEnter(),"BounceEnter");
    }

    public void BounceLeftEnter(View view) {
        show(new BounceLeftEnter(),"BounceLeftEnter");
    }

    public void BounceRightEnter(View view) {
        show(new BounceRightEnter(),"BounceRightEnter");
    }

    public void NewsPaperEnter(View view) {
        show(new NewsPaperEnter(),"NewsPaperEnter");
    }

    public void BounceTopEnter(View view) {
        show(new BounceTopEnter(),"BounceTopEnter");
    }

    public void FadeEnter(View view) {
        show(new FadeEnter(),"FadeEnter");
    }

    public void FadeExit(View view) {
        show(new FadeExit(),"FadeExit");
    }

    public void FallEnter(View view) {
        show(new FallEnter(),"FallEnter");
    }

    public void FallRotateEnter(View view) {
        show(new FallRotateEnter(),"FallRotateEnter");
    }

    public void FlipHorizontalEnter(View view) {
        show(new FlipHorizontalEnter(),"FlipHorizontalEnter");
    }

    public void FlipBottomEnter(View view) {
        show(new FlipBottomEnter(),"FlipBottomEnter");
    }

    public void FlipHorizontalSwingEnter(View view) {
        show(new FlipHorizontalSwingEnter(),"FlipHorizontalSwingEnter");
    }

    public void FlipLeftEnter(View view) {
        show(new FlipLeftEnter(),"FlipLeftEnter");
    }

    public void FlipRightEnter(View view) {
        show(new FlipRightEnter(),"FlipRightEnter");
    }

    public void FlipTopEnter(View view) {
        show(new FlipTopEnter(),"FlipTopEnter");
    }

    public void FlipVerticalEnter(View view) {
        show(new FlipVerticalEnter(),"FlipVerticalEnter");
    }

    public void FlipVerticalSwingEnter(View view) {
        show(new FlipVerticalSwingEnter(),"FlipVerticalSwingEnter");
    }

    public void FlipHorizontalExit(View view) {
        show(new FlipHorizontalExit(),"FlipHorizontalExit");
    }

    public void FlipVerticalExit(View view) {
        show(new FlipVerticalExit(),"FlipVerticalExit");
    }

    public void SlideBottomEnter(View view) {
        show(new SlideBottomEnter(),"SlideBottomEnter");
    }

    public void SlideLeftEnter(View view) {
        show(new SlideLeftEnter(),"SlideLeftEnter");
    }

    public void SlideRightEnter(View view) {
        show(new SlideRightEnter(),"SlideRightEnter");
    }

    public void SlideTopEnter(View view) {
        show(new SlideTopEnter(),"SlideTopEnter");
    }

    public void SlideLeftExit(View view) {
        show(new SlideLeftExit(),"SlideLeftExit");
    }

    public void SlideBottomExit(View view) {
        show(new SlideBottomExit(),"SlideBottomExit");
    }

    public void SlideRightExit(View view) {
        show(new SlideRightExit(),"SlideRightExit");
    }

    public void ZoomInBottomEnter(View view) {
        show(new ZoomInBottomEnter(),"ZoomInBottomEnter");
    }

    public void SlideTopExit(View view) {
        show(new SlideTopExit(),"SlideTopExit");
    }

    public void ZoomInEnter(View view) {
        show(new ZoomInEnter(),"ZoomInEnter");
    }

    public void ZoomInRightEnter(View view) {
        show(new ZoomInRightEnter(),"ZoomInRightEnter");
    }

    public void ZoomInLeftEnter(View view) {
        show(new ZoomInLeftEnter(),"ZoomInLeftEnter");
    }

    public void ZoomInTopEnter(View view) {
        show(new ZoomInTopEnter(),"ZoomInTopEnter");
    }

    public void ZoomInExit(View view) {
        show(new ZoomInExit(),"ZoomInExit");
    }

    public void ZoomOutBottomExit(View view) {
        show(new ZoomOutBottomExit(),"ZoomOutBottomExit");
    }

    public void ZoomOutExit(View view) {
        show(new ZoomOutExit(),"ZoomOutExit");
    }

    public void ZoomOutLeftExit(View view) {
        show(new ZoomOutLeftExit(),"ZoomOutLeftExit");
    }

    public void ZoomOutRightExit(View view) {
        show(new ZoomOutRightExit(),"ZoomOutRightExit");
    }

    public void Jelly(View view) {
        show(new Jelly(),"Jelly");
    }
}
