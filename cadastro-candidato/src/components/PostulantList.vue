<template>
    <div class="column">
      <h3>Lista de Postulantes</h3>
      <table class="table">
        <thead>
          <th>CPF</th>
          <th>Nome</th>
          <th>Sobre nome</th>
          <th>Edad</th>
          <th>Email</th>
          <th>Accion</th>
        </thead>
        <tbody>
          <tr v-for="(postulant, index) in listaPostulantes" :key="index">
            <td>{{ postulant.cpf }}</td>
            <td>{{ postulant.nome }} </td>
            <td>{{ postulant.sobreNome }}</td>
            <td>{{  calcularEdade(postulant.nascimento) }} anos</td>
            <td>{{ postulant.email }}</td>
            <td>
              <div class="buttons">
                <router-link :to="{name:'add-empleado', params:{'id':index}}" class="button is-primary">Aprovar</router-link>
                <button class="button is-danger" @click="showModal(postulant)">Cancelar</button>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
      <cancel-postulant v-if="showDelete" :postulantObj="postulantSelecionado" :closeModalDialog="closeModal"/>
    </div>
  </template>

<script>
import { computed, reactive, ref } from 'vue'

import {listaPostulantes} from "@/api/database.js"

import CancelPostulant from './CancelPostulant.vue'


export default {
  components:{
    CancelPostulant
  },
    setup () {
      
      const calcularEdade= computed( () => (nascimento) =>{
        const dataNascimento = new Date(nascimento)
        const hoje = new Date()
        const diferenca = hoje - dataNascimento
        const edade = new Date(diferenca).getUTCFullYear() - 1970

        return edade
      })

      const showDelete = ref(false)
      let postulantSelecionado = reactive({})

      const showModal = (value) =>{
        postulantSelecionado.nome = value.nome
        postulantSelecionado.sobreNome = value.sobreNome
        postulantSelecionado.cpf = value.cpf
        showDelete.value = true;
      }

      const closeModal = () =>{
        showDelete.value = false
      }

        return {
          listaPostulantes,
          calcularEdade,
          showDelete,
          showModal,
          postulantSelecionado,
          closeModal
        }
    }
}
</script>

<style lang="scss" scoped>

</style>