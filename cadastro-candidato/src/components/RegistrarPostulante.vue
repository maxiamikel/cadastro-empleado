<template>
    <div class="main-content">
        <h2 class="main-content__title">Cadastro de postulante</h2>
        <div class="main-content__blocks">

            <div class="field">
                <label class="label">CPF</label>
                <div class="control">
                    <input class="input" type="text" placeholder="CPF" v-model="postulante.cpf">
                </div><p>{{ postulante.cpf }}</p>
            </div>

            <div class="field">
                <label class="label">Nome</label>
                <div class="control">
                    <input class="input" type="text" placeholder="Text input" v-model="postulante.nome">
                </div>
            </div>

            <div class="field">
                <label class="label">Sobre nome</label>
                <div class="control">
                    <input class="input" type="text" placeholder="Text input" v-model="postulante.sobreNome">
                </div>
            </div>

            <div class="field">
                <label class="label">Nascimento</label>
                <div class="control">
                    <input class="input" type="date" placeholder="Text input" v-model="postulante.nascimento">
                </div>
            </div>

            <div class="field">
                <label class="label">Email</label>
                <div class="control">
                    <input class="input" type="text" placeholder="Text input" v-model="postulante.email">
                </div>
            </div>
        <br>

        </div>

        <div class="buttons">
            <button class="button is-primary" @click="enviarDados()">Enviar</button>
        </div>
        <p>{{ errorMsj }}</p>
    </div>
</template>

<script>

import {listaPostulantes} from "@/api/database"

import {usePostulantsValidation} from "@/composables/usePostulantsValidation.js"
export default {
    setup () {

        const {postulante, errorMsj, validarDados } = usePostulantsValidation();

         const enviarDados = () =>{
            if(validarDados()){
                listaPostulantes.push(postulante)
            }else{
                errorMsj.value = 'Error, dados incompleto';
            }
         }

        return {
           postulante,
           enviarDados,
           errorMsj
        }
    }
}
</script>

<style lang="scss" scoped>
    .main-content{
        border: none;
        width:80%;
        display: block;
        &__blocks{
            border: none;
            width: 80%;
            display: block;
            margin: 0 auto;
        }
        &__title{
            border: none;
            width: 90%;
            padding-left: 2em;
            font-size: 20px;
        }
    }

    .field{
        border: none;
        display: block;
        margin: 0 auto;
        box-sizing: border-box;
    }

    .input{
        width: 100%;
    }

    .buttons{
        display: flex;
        align-items: center;
        justify-content: center;
    }
</style>