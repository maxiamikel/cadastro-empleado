<template>
    <div class=" main-detail">
    <div class="card main-card">
        <h4>Detalle Empleados</h4>
        <div class="box ">
          <article class="media main-box">
            <div class="media-left main-left">
              <figure class="image is-64x64">
                <img class="media main-box__img" src="https://bulma.io/images/placeholders/128x128.png" alt="Image">
              </figure>
            </div>
            <div class="media-content" v-if="empleado">
              <div class="content">
                <p>
                  <strong>Nome: </strong> <span>{{ empleado.nome }}</span>
                </p>
                <p>
                  <strong>Sobre Nome: </strong> <span>{{empleado.sobreNome}}</span>
                </p>
                <p>
                  <strong>Edade: </strong> <span>{{ empleado.nascimento }}28 años</span>
                </p>
                <p>
                  <strong>CPF: </strong> <span> {{ empleado.cpf }}</span>
                </p>
                <p>
                  <strong>Email: </strong> <span> {{ empleado.email }}</span>
                </p>
                <p>
                  <strong>Codigo: </strong> <span>{{empleado.codigo}}</span>
                </p>
                <p>
                  <strong>Area: </strong> <span>{{empleado.area}}</span>
                </p>
              </div>
            </div>
          </article>
        </div>
      </div>
    </div>
</template>

<script>
export default {
    props: {
        empleado: Object
    },
    setup () {
        

        return {}
    }
}
</script>

<style lang="scss" scoped>
    .main-detail{
         position: absolute;
         z-index: 999;
         top: 10px;
         right: -130px;
         background: rgba(255 , 240, 245, 1.7);
        width: 250px;
        // height: 50vh;
         text-align: center;
    }
    .main-box{
        display: block;
        align-items: center;
        justify-content: center;
        border: none;
        &__img{
            border:none;
        }
    }
    h4{
         background: rgba(255 , 240, 245, 1.7);
         margin: 0px;
         padding: 1em 0em;
     }
    .main-left{
        border:none;
        display: flex;
        align-items: center;
        justify-content: center;
    }
    .main-card{
        border: none;
    }

</style>