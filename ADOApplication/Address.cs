using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADOApplication
{
    class Address
    {
        private String addressLine1;
        private String addressLine2;
        private String landMark1;
        private String landMark2;
        private String area;
        private String city;
        private String state;
        private String pincode;

        public string AddressLine1 { get => addressLine1; set => addressLine1 = value; }
        public string AddressLine2 { get => addressLine2; set => addressLine2 = value; }
        public string LandMark1 { get => landMark1; set => landMark1 = value; }
        public string LandMark2 { get => landMark2; set => landMark2 = value; }
        public string Area { get => area; set => area = value; }
        public string City { get => city; set => city = value; }
        public string State { get => state; set => state = value; }
        public string Pincode { get => pincode; set => pincode = value; }
    }
}
