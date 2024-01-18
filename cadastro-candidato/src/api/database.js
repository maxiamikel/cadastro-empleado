import { reactive } from "vue";

const listaPostulantes = reactive([
    {
       'cpf': '00000001',
       'nome': 'Jaime ',
       'sobreNome': 'Moyano',
       'nascimento': '2005-03-20',
       'email':'jaime@maxi.com'
     },
     {
       'cpf': '00000002',
       'nome': 'Marius ',
       'sobreNome': 'Vicente',
       'nascimento': '2002-01-15',
       'email':'mauris@maxi.com'
     },
     {
       'cpf': '00000003',
       'nome': 'Josep Maria',
       'sobreNome': 'Fidalgo',
       'nascimento': '1995-10-20',
       'email':'josep@maxi.com'
     },
     {
       'cpf': '00000004',
       'nome': 'Adria ',
       'sobreNome': 'Carretero',
       'nascimento': '1999-10-15',
       'email':'adria@maxi.com'
     },
     {
       'cpf': '00000005',
       'nome': 'Basilio',
       'sobreNome': 'Amador',
       'nascimento': '2001-12-05',
       'email':'basilio@maxi.com'
     },
   ])
   
   
   const listaEmpleados = [
     {
       'cpf': '00000020',
       'nome': 'Maria Amparo',
       'sobreNome': 'Ballester',
       'nascimento': '12-05-2001',
       'email':'maria@maxi.com',
       'area': 'Informática',
       'codigo': 'IN20020'
     },
     {
       'cpf': '00000021',
       'nome': 'Sheila ',
       'sobreNome': 'Mota',
       'nacimento': '12-05-2001',
       'email':'maria@maxi.com',
       'area': 'Contabilidad',
       'codigo': 'CO20021'
     },
     {
       'cpf': '00000022',
       'nome': 'Mateo',
       'sobreNome': 'Rodríguez',
       'nacimento': '12-05-2001',
       'email':'maria@maxi.com',
       'area': 'Administracion',
       'codigo': 'AD20022'
     },
     {
       'cpf': '00000023',
       'nome': 'Sofia',
       'sobreNome': 'Ramírez',
       'nascimento': '12-05-2001',
       'email':'maria@maxi.com',
       'area': 'Caja',
       'codigo': 'CA20023'
     },
     {
       'cpf': '00000024',
       'nome': 'Maria Amparo',
       'sobreNome': 'Ballester',
       'nascimento': '12-05-2001',
       'email':'maria@maxi.com',
       'area': 'Informática',
       'codigo': 'IN20020'
     },
     {
       'cpf': '00000025',
       'nome': 'Santiago ',
       'sobreNome': 'García',
       'nascimento': '12-05-2001',
       'email':'maria@maxi.com',
       'area': 'Contabilidad',
       'codigo': 'CO20025'
     },
   ]
   export { listaPostulantes, listaEmpleados };