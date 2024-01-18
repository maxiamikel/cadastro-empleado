import { reactive, ref } from "vue";

export function usePostulantsValidation() {

    const postulante = reactive({
        'cpf': '', 
        'nome': '', 
        'sobreNome': '', 
        'nascimento': '', 
        'email':''
    })

    const errorMsj = ref('')
    const validarDados= function(){
        if((postulante.cpf.length < 5) || (postulante.email < 10) || (postulante.nascimento <4)){
            return false;
        }
        return true
     }
    
     return{
        postulante,
        errorMsj,
        validarDados
     }
}