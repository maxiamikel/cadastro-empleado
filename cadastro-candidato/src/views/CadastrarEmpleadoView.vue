<template>
    <div class="main-cadastro">
       <cadastrar-empleado />
    </div>
</template> 

<script>
import CadastrarEmpleado from '@/components/CadastrarEmpleado.vue';
export default {
    components:{
        CadastrarEmpleado

    },
    setup () {
        

        return {}
    }
}
</script>

<style lang="scss" scoped>
    .main-cadastro{
        width: 80%;
        border: none;
        display: flex;
        align-items: center;
        justify-content: center;
    }
</style>