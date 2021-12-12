package com.company.room;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.company.room.databinding.FragmentNuevoElementoBinding;

import java.text.DecimalFormat;


public class NuevoElementoFragment extends Fragment {
    private FragmentNuevoElementoBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentNuevoElementoBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ElementosViewModel elementosViewModel = new ViewModelProvider(requireActivity()).get(ElementosViewModel.class);
        NavController navController = Navigation.findNavController(view);

        binding.crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = binding.nombre.getText().toString();
                String descripcion = binding.descripcion.getText().toString();
                switch (nombre){
                    case "Verstappen":
                        elementosViewModel.insertar(new Elemento(R.drawable.versttapen,"1",nombre, "Red Bull", descripcion));
                        break;
                    case "Hamilton":
                        elementosViewModel.insertar(new Elemento(R.drawable.hamilton,"2",nombre, "Mercedes", descripcion));
                        break;
                    case "Norris":
                        elementosViewModel.insertar(new Elemento(R.drawable.norris,"3",nombre, "McClaren", descripcion));
                        break;
                    case "Sainz":
                        elementosViewModel.insertar(new Elemento(R.drawable.sainz,"4",nombre, "Ferrari", descripcion));
                        break;
                    case "Alonso":
                        elementosViewModel.insertar(new Elemento(R.drawable.alonso,"5",nombre, "Alpine", descripcion));
                        break;
                    default:
                        elementosViewModel.insertar(new Elemento(R.drawable.noimg,"¿...?",nombre, "¿...?", descripcion));
                        break;



                }


                navController.popBackStack();
            }
        });
    }
}