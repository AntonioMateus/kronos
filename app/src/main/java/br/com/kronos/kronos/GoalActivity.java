package br.com.kronos.kronos;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;


import java.util.HashMap;
import java.util.List;

import br.com.kronos.database.KronosDatabase;
import br.com.kronos.kronos.R;
import br.com.kronos.kronos.adapters.ExpandableAdapter;

public class GoalActivity extends Activity implements View.OnClickListener {
    private ImageView _image;
    private float _newAngle, _oldAngle;
    private ProgressBar mProgress;
    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();

    private List<String> listGroup;
    private HashMap<String,List<Meta>> listData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        KronosDatabase database = new KronosDatabase(GoalActivity.this);
        //Criacao de metas para teste
        Meta meta1 = new Meta("verao 2020",3,0,"saude",7,12,2015);
        meta1.setTempoAcumulado(0);
        meta1.setTempoEstipulado(130.0);
        Meta meta2 = new Meta("assistir star wars",2,0,"diversao",28,11,2015);
        meta2.setTempoAcumulado(15);
        meta2.setTempoEstipulado(18);
        meta2.setTerminoMeta(29, 11, 2015);
        database.addMeta(meta1);
        database.addMeta(meta2);
        //---------------------------------------------
        //List<Atividade> teste2 = database.getAtividadesHistorico(1,12,2015);
        Meta teste = database.devolveMeta("verao 2020");
        //listGroup = database.getCategorias();
        //listData = database.devolveRelacaoCategoriaMeta();
        /*ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListView.setAdapter(new ExpandableAdapter(GoalActivity.this,listData,listGroup));
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Toast.makeText(GoalActivity.this, "item " + childPosition + " do grupo " + groupPosition, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(GoalActivity.this, "grupo " + groupPosition + " expandindo", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(GoalActivity.this, "grupo " + groupPosition + " retraindo", Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.icon_group));
        *//*
        ImageButton botao = (ImageButton) findViewById(R.id.imageButton_spinner);
        botao.setOnClickListener(this);
        _image = (ImageView) findViewById(R.id.imageButton_spinner);
        mProgress = (ProgressBar) findViewById(R.id.progressBar_goal);
        mProgress.setProgress(80);
        mProgress.setIndeterminate(false);
        */
    }

    public void onClick(View view) {
        /*
        if (view.getId() == R.id.imageButton_spinner) {
            _newAngle = _oldAngle + 180;
            //LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) _image.getLayoutParams();
            //LayoutParams layoutParams = (LinearLayout.LayoutParams)
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) _image.getLayoutParams();
            int centerX = layoutParams.leftMargin + (_image.getWidth()/2);
            int centerY = layoutParams.topMargin + (_image.getHeight()/2);
            RotateAnimation animation = new RotateAnimation(_oldAngle, _newAngle, centerX, centerY);
            animation.setDuration(0);
            animation.setRepeatCount(0);
            animation.setFillAfter(true);
            _image.startAnimation(animation);
            _oldAngle = _newAngle;
        }
        */
    }
}