<template>
  <div class="main-home">
    <registrar-postulante />
  </div>
</template>

<script>

import RegistrarPostulante from "@/components/RegistrarPostulante.vue"
export default {
  name: "HomeView",
  components:{
    RegistrarPostulante
  }
}
</script>

<style lang="scss" scoped>
 .main-home{
  width: 80%;
  display: flex;
  align-items: center;
  justify-content: center;
  border: none;
 }
</style>
