<!DOCTYPE html>
<html lang="id">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Selamat Ulang Tahun Meilyana</title>
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet" />
  <link href="https://fonts.googleapis.com/css2?family=Kaushan+Script&display=swap" rel="stylesheet" />
  <style>
    body {
      margin: 0;
      font-family: 'Poppins', sans-serif;
      background-color: black;
      color: white;
      text-align: center;
      overflow-x: hidden;
    }
    .header {
      margin-top: 1rem;
      font-size: 1rem;
      color: #ccc;
    }
    .countdown-large {
      font-size: 2rem;
      font-weight: bold;
      color: #ff66cc;
      margin-top: 20vh;
    }
    .section, .nav-buttons, #loveBtn, #cake, #navButtons, #section1, #section2, #section3 {
      display: none;
    }
    .section.active {
      display: block;
      padding: 2rem;
    }
    h1 {
      font-size: 3em;
      color: #ff99cc;
      font-family: 'Kaushan Script', cursive;
      margin-top: 2rem;
    }
    .ucapan {
      font-size: 1.5rem;
      color: #ffe6f0;
      margin: 1rem 0;
      opacity: 0;
      transition: opacity 1s ease-in-out;
    }
    .ucapan.show {
      opacity: 1;
    }
    .cake.show {
      display: block;
      width: 200px;
      margin: 2rem auto;
      transition: all 0.5s ease-in-out;
    }
    .nav-buttons.show {
      display: block;
      margin-top: 2rem;
    }
    .nav-buttons button {
      background-color: #ff4da6;
      border: none;
      padding: 0.75rem 1.5rem;
      font-size: 1rem;
      color: white;
      border-radius: 12px;
      cursor: pointer;
      margin: 0.5rem;
    }
  </style>
</head>
<body>
  <div class="header">
    <div id="countdown"></div>
  </div>
  <div id="bigCountdown" class="countdown-large"></div>

  <div id="section1" class="section active">
    <h1>Selamat Ulang Tahun, Meilyana Angraini!</h1>
    <p id="ucapan1" class="ucapan">Di hari spesialmu yang ke-25 ini,</p>
    <p id="ucapan2" class="ucapan">aku ingin kamu tahu betapa berharganya kamu dalam hidupku.</p>
    <p id="ucapan3" class="ucapan">Kamu cahaya dalam gelapku, pelangi setelah hujan.</p>
    <button id="loveBtn" onclick="showCake()">I Love You</button>
    <img id="cake" class="cake" src="https://cdn.pixabay.com/photo/2017/01/31/20/46/birthday-cake-2023960_960_720.png" alt="Birthday Cake">
  </div>

  <div id="section2" class="section">
    <h1>Kisah Cinta Kita</h1>
    <p class="ucapan">Ada seorang laki-laki yang diam-diam memimpikan masa depan bersama perempuan terbaik yang ia kenal.</p>
    <p class="ucapan">Dengan segala keterbatasannya, ia berusaha, jatuh dan bangkit lagi demi satu tujuan: menikahimu.</p>
    <p class="ucapan">Dan hari ini, dia hanya ingin bilang: Aku akan terus berjuang sampai kamu jadi milikku seutuhnya.</p>
  </div>

  <div id="section3" class="section">
    <h1>Ulang Tahunmu, Momen Paling Indah</h1>
    <p class="ucapan">Hari ini bukan hanya hari ulang tahunmu, tapi juga hari paling berharga bagiku.</p>
    <p class="ucapan">Aku ingin merayakannya bukan dengan pesta mewah, tapi dengan cinta yang tulus.</p>
    <p class="ucapan">Setiap senyummu hari ini adalah hadiah terbesar untukku.</p>
    <p class="ucapan">Selamat ulang tahun, sayang. Semoga semua harapanmu terkabul, dan aku ada di dalamnya.</p>
  </div>

  <div class="nav-buttons" id="navButtons">
    <button onclick="navigate('section1')">Ucapan</button>
    <button onclick="navigate('section2')">Cerita Cinta</button>
    <button onclick="navigate('section3')">Ulang Tahun Romantis</button>
  </div>

  <audio id="cheer">
    <source src="https://cdn.pixabay.com/download/audio/2021/09/04/audio_7a3c5195a4.mp3?filename=kids-cheering-44164.mp3" type="audio/mp3">
  </audio>

  <script>
    const targetDate = new Date("2025-05-15T00:00:00").getTime();
    const bigCountdown = document.getElementById("bigCountdown");

    const countdownInterval = setInterval(() => {
      const now = new Date().getTime();
      const distance = targetDate - now;

      const days = Math.floor(distance / (1000 * 60 * 60 * 24));
      const hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
      const minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
      const seconds = Math.floor((distance % (1000 * 60)) / 1000);

      document.getElementById("countdown").innerText =
        `Menuju ulang tahun: ${days}h ${hours}j ${minutes}m ${seconds}d`;
      bigCountdown.innerText =
        `${days} Hari ${hours} Jam ${minutes} Menit ${seconds} Detik lagi menuju ulang tahun meilyana angraini!`;

      if (distance <= 0) {
        clearInterval(countdownInterval);
        document.getElementById("countdown").style.display = "none";
        bigCountdown.style.display = "none";
        unlockContent();
      }
    }, 1000);

    function unlockContent() {
      const ucapan1 = document.getElementById("ucapan1");
      const ucapan2 = document.getElementById("ucapan2");
      const ucapan3 = document.getElementById("ucapan3");
      const loveBtn = document.getElementById("loveBtn");

      document.getElementById("section1").style.display = "block";

      setTimeout(() => ucapan1.classList.add("show"), 1000);
      setTimeout(() => ucapan2.classList.add("show"), 3000);
      setTimeout(() => {
        ucapan3.classList.add("show");
        setTimeout(() => {
          loveBtn.style.display = "inline-block";
        }, 1500);
      }, 5000);
    }

    function showCake() {
      const cake = document.getElementById("cake");
      const cheer = document.getElementById("cheer");
      cake.classList.add("show");
      cheer.play();

      setTimeout(() => {
        navigate('section2');
        document.getElementById("navButtons").classList.add("show");
        showUcapanSatuSatu('section2');
      }, 5000);
    }

    function navigate(id) {
      document.querySelectorAll('.section').forEach(sec => sec.classList.remove('active'));
      document.getElementById(id).classList.add('active');
      if (id === 'section2' || id === 'section3') {
        showUcapanSatuSatu(id);
      }
    }

    function showUcapanSatuSatu(sectionId) {
      const ucapanElements = document.querySelectorAll(`#${sectionId} .ucapan`);
      ucapanElements.forEach((el, index) => {
        el.classList.remove("show");
        setTimeout(() => {
          el.classList.add("show");
        }, index * 2000);
      });
    }
  </script>
</body>
</html>