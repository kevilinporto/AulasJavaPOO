package com.senai.aula07_mvc.crud_usuario.controller;

import com.senai.aula07_mvc.crud_usuario.model.Supervisor;
import com.senai.aula07_mvc.crud_usuario.model.SupervisorDAO;

import java.util.ArrayList;
import java.util.List;

public class SupervisorController {
    SupervisorDAO supervisorDAO = new SupervisorDAO();

    public List<Supervisor> listarSupervisores(){
    }
    public boolean cadastrarSupervisor(Supervisor supervisor){

        return false;
    }

    public boolean atualizarSupervisor(Supervisor supervisor){

        return false;
    }

    public boolean deletarSupervisor(int id){

        return false;
    }
}
