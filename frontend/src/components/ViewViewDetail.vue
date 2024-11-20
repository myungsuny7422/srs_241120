<template>

    <v-card outlined>
        <v-card-title>
            View # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="SeatId" v-model="item.seatId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="SeatName" v-model="item.seatName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="ReservedYn" v-model="item.reservedYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ReservedEmployeeId" v-model="item.reservedEmployeeId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Date label="ReservedDt" v-model="item.reservedDt" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'ViewViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/views/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

