<template>
    <div class="main-modal">
      <div class="card is-centered primary">
        <header class="card-header">
          <p class="card-header-title">
            ¿Rechazar Postulante?
          </p>
        </header>
        <div class="card-content">
          <div class="content">
            <p>{{ postulantObj.nome }} {{ postulantObj.sobreNome }}</p>
            <p>CPF: {{ postulantObj.cpf }} </p>
          </div>
        </div>
        <footer class="card-footer">
          <a href="#" class="card-footer-item">SI</a>
          <a href="#" class="card-footer-item" @click="closeModalDialog()">Cancelar</a>
        </footer>
      </div>
    </div>
  </template>
  <script>
export default {
    props: {
        postulantObj: {
            type: Object,
            default: null
        },
        closeModalDialog:{
            type:Function,
            default: () =>{
                console.log('--');
            }
        }
    },
    setup (props) {
        props

        return {}
    }
}
</script>

<style lang="scss" scoped>
    .main-modal{
        position: absolute;
        left: 0;
        top: 0;
        background: rgba($color: #f1f1f1, $alpha: 0.7);
        display: flex;
        align-items: center;
        justify-content: center;
        width: 100%;
        height: 100vh;
    }
</style>