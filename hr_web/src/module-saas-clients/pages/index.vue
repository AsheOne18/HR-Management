<template>
  <div class="dashboard-container">
    <div class="app-container">
      <el-card shadow="never">
        <!-- elementui table -->
          <el-table :data="dataList" border style="width: 100%">
          <el-table-column fixed type="index" label="ID" width="50"></el-table-column>
          <el-table-column fixed prop="name" label="Company" width="200"></el-table-column>
          <el-table-column fixed prop="version" label="Version" width="150"></el-table-column>
          <el-table-column fixed prop="companyPhone" label="Phone" width="150"></el-table-column>
          <el-table-column fixed prop="expirationDate" label="Expiration" width="150"></el-table-column>
          <el-table-column fixed prop="state" label="State" width="150">
            <template slot-scope="scope">
            <el-switch
              v-model="scope.row.state"
              inactive-value="0"
              active-value="1"
              disabled
              active-color="#13ce66"
              inactive-color="#ff4949">
            </el-switch>
            </template>
          </el-table-column>
          <el-table-column fixed="right" label="Controll" width="150">
            <template slot-scope="scope">
              <router-link :to="'/saas-clients/details/'+scope.row.id">Cheak</router-link>
            </template>
          </el-table-column>
        </el-table>
        <!-- elementui table -->
      </el-card>
     </div> 
  </div>
</template>

<script>
import {list} from '@/api/base/sassClients'
export default {
  name: 'saas-clients-table-index',
  data() {
    return {
      dataList: []
    }
  },
  methods: {
    getList(){
      list().then(res => {
        this.dataList = res.data.data;
        console.log(res).data;
      })
    }
  },
  created() {
    this.getList();
  },
}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
.alert {
  margin: 10px 0px 0px 0px;
}
.pagination {
  margin-top: 10px;
  text-align: right;
}
</style>
