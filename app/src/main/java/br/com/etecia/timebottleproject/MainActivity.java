package br.com.etecia.timebottleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] tipsBored = {"Take a walk","Learn a new recipe","Make origami","Write","Stretch","Make a new look"};
    String[] descBored = {"See places around, the lights and sounds can reward the beholder with curius thoughts> \n good to rest and have new ideas.","If you cook for yourself daily it will probably make your meals more interesting, give you a fun (a kinda messy) time.",
            "Challenging and beautifull works made of paper, look for your favorite and start folding.","Thoughts, dreams, music, everything that you can find in your 'head files' ","Stretch","Make a new look"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView.findViewById(R.id.listaBaseId);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ListaBase.class);
            }
        });

    }
    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position,View convertView, ViewGroup parent) {

        }
    }
}
