<template>
    <div>
    <h1>회원가입</h1>
    <button type="submit" @click="register_button">Register</button>
        <form method="post">
            <div class="container">
                <label><b>Username</b></label>
                <input type="text" v-model="userid" placeholder="Enter Username" name="userid" required>
                <h3>입력한 아이디: {{userid}}</h3>
                <label><b>Password</b></label>
                <input type="password" v-model="password" placeholder="Enter Password" name="password" required>
                <h3>입력한 비번: {{password}}</h3>
                <div id='example-3'> 취미:
                    <input type="checkbox" id="jack" value="Java" v-model="checkedNames">
                    <label for="jack">Java</label>
                    <input type="checkbox" id="john" value="JavaScript" v-model="checkedNames">
                    <label for="john">JavaScript</label>
                    <input type="checkbox" id="mike" value="Vue" v-model="checkedNames">
                    <label for="mike">Vue</label>
                    <br>
                    <span>체크한 취미: {{ checkedNames }}</span>
                </div>
                <span>기 타 :</span>
                <p style="white-space: pre-line">{{ message }}</p>
                <textarea v-model="message" placeholder="여러줄을 입력해보세요"></textarea>
                <br>
                성별:<br>
                <input type="radio" id="one" value="male" v-model="picked">
                <label for="one">man</label>
                <br>
                <input type="radio" id="two" value="female" v-model="picked">
                <label for="two">women</label>
                <br>
                <span>선택: {{ picked }}</span>
                <br>통신사 선택<br>
                <select v-model="telephone">
                    <option disabled value="">통신사</option>
                    <option>SKT</option>
                    <option>KT</option>
                    <option>LGU+</option>
                </select>
                <br>
                <span>통신사: {{ telephone }}</span>
                <br>
                <select v-model="position" multiple>
                    <option>공격수</option>
                    <option>수비수</option>
                    <option>골키퍼</option>
                </select><br>
                <span>포지션: {{ position }}</span>
                <br>
                <a>동의</a>
                <input
                        type="checkbox"
                        v-model="toggle"
                        true-value="yes"
                        false-value="no"
                ><br>
                <span>Selected: {{ toggle }}</span>
            </div>

            <div class="container" style="background-color:#f1f1f1">
                <router-link to="/Counter"><button type="button" class="cancelbtn">Cancel</button></router-link>
                <span class="psw">Forgot <a href="#">password?</a></span>
            </div>
        </form>
    </div>
</template>

<script>
        import {mapActions} from 'vuex'
    export default {
        data() {
            return{
            userid: '', password: '', message: '', selected: '', position: '', picked: '', telephone: '', toggle: '',
            checkedNames: ''
            }
        },
        methods: mapActions([
            'register_button'
        ])
    }
</script>

<style scoped>

</style>