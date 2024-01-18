<template>
    <div class="container is-fullhd">
      <div class="card">
        <h3>Empleados Registrados</h3>
        <div class="table-container" id="table-detail">
          <table class="table is-striped is-fullwidth">
            <thead>
              <th>#</th>
              <th>Nome</th>
              <th>Sobre Nome</th>
              <th>Código</th>
              <th>*</th>
            </thead>
            <tbody>
              <tr v-for="(empleado, index) in listaEmpleados" :key="index">
                <td>{{ index +1 }}</td>
                <td>{{ empleado.nome }}</td>
                <td>{{empleado.sobreNome}}</td>
                <td>{{ empleado.codigo }}</td>
                <td>
                  <button class="button is-info is-light" @click="showDetailScreen(empleado)">Ver</button>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>

      <Teleport to="#table-detail" v-if="showDetail">
         <empleado-detail :empleado="empleadoSelecionado"/>
      </Teleport>
    </div>
  </template>

<script>
import { reactive, ref } from "vue";

import {listaEmpleados} from "@/api/database.js"

import EmpleadoDetail from "@/components/EmpleadoDetail.vue"
export default {
    components: {
        EmpleadoDetail,
    },
    setup () {
        

        const showDetail = ref(false)

        let empleadoSelecionado = reactive({})

        const showDetailScreen = (empleado) =>{
            empleadoSelecionado.nome = empleado.nome
            empleadoSelecionado.sobreNome = empleado.sobreNome
            empleadoSelecionado.cpf = empleado.cpf
            empleadoSelecionado.email = empleado.email
            empleadoSelecionado.codigo = empleado.codigo
            empleadoSelecionado.area = empleado.area
            showDetail.value = true
            console.log(empleado);
        }

        const hideDetail = () =>{
            showDetail.value = false
        }

        return {
            listaEmpleados,
            showDetail,
            hideDetail,
            showDetailScreen,
            empleadoSelecionado,
        }
    }
}
</script>

<style lang="scss" scoped>

</style>