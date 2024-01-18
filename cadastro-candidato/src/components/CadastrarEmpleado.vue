<template>
    <div class="content">
      <h3>ID: {{parseInt(route.params.id) }}</h3>
      <div class="card-content ">
        <div class="field">
          <label class="label">CPF</label>
          <div class="control">
            <input class="input" type="text" placeholder="CPF" v-model="empleado.cpf" readonly>
          </div>
        </div>
  
        <div class="field">
          <label class="label">Nome</label>
          <div class="control">
            <input class="input" type="text" placeholder="Nome" v-model="empleado.nome" readonly>
          </div>
        </div>

        <div class="field">
          <label class="label">Sobre Nome</label>
          <div class="control">
            <input class="input" type="text" placeholder="Sobre Nome" v-model="empleado.sobreNome" readonly>
          </div>
        </div>
        
        <div class="field">
          <label class="label">F. Nascimento</label>
          <div class="control">
            <input class="input" type="date" placeholder="Nascimento" v-model="empleado.nascimento"   readonly>
          </div>
        </div>

        <div class="field">
          <label class="label">Email</label>
          <div class="control">
            <input class="input" type="text" placeholder="Email" v-model="empleado.email" readonly>
          </div>
        </div>
  
        <div class="field">
          <label class="label">Codigo Funcionário</label>
          <div class="control">
            <input class="input" type="text" placeholder="Codigo" v-model="empleado.codigo" readonly>
          </div>
        </div>

        
        <div class="field">
          <label class="label">Area:</label>
          <div class="select">
            <select  v-model="area">
              <option value="null">Selecionar</option>
              <option value="Informática">Informática</option>
              <option value="Contabilidade">Contabilidade</option>
              <option value="Administracao">Administração</option>
              <option value="Caixa">Caixa</option>
            </select>
          </div>
        </div>

        <p class="is-primary"> {{ errorMsj }} </p>
        <button class="button is-primary" @click="salvarEmpleado()" >Actualizar Dados</button>
      </div>
    </div>
  </template>

<script>

import { ref ,onBeforeMount} from 'vue';
import { useRoute } from 'vue-router';

import { listaPostulantes , listaEmpleados} from '@/api/database';
import {usePostulantsValidation} from "@/composables/usePostulantsValidation.js";

export default {

    setup () {
        
        const route = useRoute()

        const {postulante:empleado, errorMsj, validarDados} = usePostulantsValidation()

        
        

        const area = ref('')
        const codigo = ref('')

        const carregarPostulante = () => {

            let postulant = listaPostulantes[parseInt(route.params.id)]
            let codigo = 'EM-'+parseInt(route.params.id)+'-'+new Date().getFullYear()
            empleado.cpf = postulant.cpf
            empleado.nome = postulant.nome
            empleado.sobreNome = postulant.sobreNome
            empleado.nascimento = postulant.nascimento
            empleado.email = postulant.email
            empleado.codigo = codigo
        }
        
        onBeforeMount( () => {
            carregarPostulante()
        })

        const salvarEmpleado = () =>{
          if(validarDados()){
            empleado.area = area.value
            listaEmpleados.push(empleado)
           console.log(empleado);
          }else{
            errorMsj.value = 'Error ao carregar os dados'
            console.log('Error ao carregar os dados')
          }
          
        }

        return {
            empleado,
            route,
            salvarEmpleado,
            errorMsj,
            area,
            codigo,
        }
    }
}
</script>

<style lang="scss" scoped>
  .content{
    border: none;
    width: 70%;
  }
</style>