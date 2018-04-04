package calculadora.com.br.calculadoraflex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.TextView;

import java.util.List;

public class AdapterCarros extends BaseAdapter {

    Context contexto;
    List<Carro> carros;


    public AdapterCarros(Context contexto, List<Carro> carros) {
        this.contexto = contexto;
        this.carros = carros;
    }


    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return carros.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewLinha = LayoutInflater.from(contexto).inflate(R.layout.activity_main_calculadora,parent,false);
        TextView marca = (TextView) viewLinha.findViewById(R.id.textViewMarca);
        return viewLinha;
    }
}
